class Video < ActiveRecord::Base
  attr_accessible :title, :vid, :embed_html

  default_scope order: 'videos.heuristic DESC'

  def self.from_dancers_followed_by(user)
    followed_dancers_ids = "SELECT dancer_id FROM user_dancer_relationships WHERE user_id = :user_id" 
    where("dancer_id IN (#{followed_dancers_ids})",
           user_id: user.id)
  end

  def self.from_category(user, cat_id)
    followed_dancers_ids = "SELECT dancer_id FROM user_dancer_relationships WHERE user_id = :user_id" 
    
    where("category_id IN (#{cat_id}) and dancer_id NOT IN (#{followed_dancers_ids})", 
          user_id: user.id)
  end
end
