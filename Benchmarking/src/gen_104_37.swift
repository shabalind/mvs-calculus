  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  func f32(_ v0: Double) -> Double {
    var v5: Double = v0
    v5 = v0
    var v3: Double = v5
    var v11: Double = v5
    v5 = v0
    v3 = v11
    let v14: Double = v3 - v3
    var v28: Double = v14
    return v28
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v7: Double = f32(v1)
    let v4: Double = v7 + v1
    return v4
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])]], p1: [[s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]]), s1(p0: [[s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])]], p1: [[s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]]), s1(p0: [[s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])], [s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])]], p1: [[s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])]])]
    let v1: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
