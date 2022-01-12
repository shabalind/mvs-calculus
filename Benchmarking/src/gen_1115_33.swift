  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s0], _ v2: [[s1]], _ v3: Double) -> Double {
    let v7: s0 = v1[0]
    let v12: s0 = v1[1]
    let v13: [[Double]] = v12.p0
    let v20: [Double] = v13[0]
    let v18: [[Double]] = v7.p0
    let v34: Double = v20[0]
    var v46: Double = v34
    let v67: [Double] = v18[1]
    let v45: Double = v67[0]
    v46 = v45
    return v46
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])), p1: [s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))])
    let v1: [s0] = [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])]
    let v2: [[s1]] = [[s1(p0: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]))], [s1(p0: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]), p1: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]))], [s1(p0: s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), p1: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]]))]]
    let v3: Double = 65.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 65.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
