class Video < ActiveRecord::Base
  attr_accessible :title, :vid, :embed_html

  def self.from_dancers_followed_by(user)
    followed_dancers_ids = "SELECT dancer_id FROM user_dancer_relationships WHERE user_id = :user_id" 
    where("dancer_id IN (#{followed_dancers_ids})",
           user_id: user.id)
  end
end
