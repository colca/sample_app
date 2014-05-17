namespace :db do
  desc "Fill database with sample data"
  task populate: :environment do
    make_users
    make_microposts
    make_relationships
    make_usercatrelationships
    make_categories
    make_dancers
  end
end

def make_categories
  cat = Category.create!(cName: "Hiphop")
  cat2 = Category.create!(cName: "Jazz")
  cat3 = Category.create!(cName: "Poppin")
end

def make_dancers
  categories = Category.all
  categories.each {|category|
  10.times do |n|
    name = Faker::Name.name
    Dancer.create!(name: name, 
                   category_id: category.id)

  end
  }
end 
    
    
def make_users
    admin = User.create!(name: "Example User",
                 email: "example@railstutorial.org",
                 password: "foobar",
                 password_confirmation: "foobar")
    admin.toggle!(:admin) 
    99.times do |n|
      name = Faker::Name.name
      email = "example-#{n+1}@railstutorial.org"
      password = "password"
      User.create!(name: name, 
                   email: email,
                   password: password,
                   password_confirmation: password)
    end
end

def make_microposts
    users = User.all(limit: 6)
    50.times do 
      content = Faker::Lorem.sentence(5)
      users.each { |user| user.microposts.create!(content: content) }
    end
end

def make_relationships
  users = User.all
  user = users.first
  followed_users = users[2..50]
  followers = users[3..40]
  followed_users.each { |followed| user.follow!(followed) }
  followers.each { |follower| follower.follow!(user) }
end

def make_usercatrelationships
  users = User.all
  user = users.first
  categories = Category.all
  categories.each { |category| user.followCat!(category) }
end
