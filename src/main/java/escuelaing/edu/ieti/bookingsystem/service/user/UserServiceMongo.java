package escuelaing.edu.ieti.bookingsystem.service.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import escuelaing.edu.ieti.bookingsystem.exception.UserNotFoundException;
import escuelaing.edu.ieti.bookingsystem.repository.user.User;
import escuelaing.edu.ieti.bookingsystem.repository.user.UserMongoRepository;

@Service
public class UserServiceMongo implements UsersService {

    private final UserMongoRepository userMongoRepository;

    public UserServiceMongo(@Autowired UserMongoRepository userMongoRepository) {
        this.userMongoRepository = userMongoRepository;
    }

    @Override
    public User save(User user) {
        return userMongoRepository.save(user);

    }

    @Override
    public Optional<User> findById(String id) {
        Optional<User> user = userMongoRepository.findById(id);
        if (!user.isPresent()) {
            throw new UserNotFoundException(id);            
        }
        return user;
    }

    @Override
    public List<User> all() {
        return userMongoRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        Optional<User> user = userMongoRepository.findById(id);
        if (!user.isPresent()) {
            throw new UserNotFoundException(id);
        }
        userMongoRepository.deleteById(id);
    }

    @Override
    public User update(User user, String userId) {
        Optional<User> userOptional = userMongoRepository.findById(userId);
        if (!userOptional.isPresent()) {
            throw new UserNotFoundException(userId);
        }
        return userMongoRepository.save(user);
    }
}
