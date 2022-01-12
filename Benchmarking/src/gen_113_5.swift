  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s1]
  }
  func f20(_ v0: s1) -> s1 {
    return v0
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v6: Double = v1 - v1
    let v13: s2 = v0[0]
    let v16: s1 = v13.p0
    let v30: s1 = f20(v16)
    let v50: s0 = v30.p1
    let v40: [[Double]] = v50.p1
    let v39: [Double] = v40[0]
    let v86: Double = v39[0]
    var v73: Double = v6
    let v175: Double = v73 - v86
    return v175
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])), p1: [s1(p0: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])), s1(p0: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])], p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])), s1(p0: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])], p1: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]))]), s2(p0: s1(p0: [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])], p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])), p1: [s1(p0: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], p1: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])), s1(p0: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])], p1: s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])), s1(p0: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])], p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]))])]
    let v1: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
