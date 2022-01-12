  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s5 {
    var p0: [[s0]]
    var p1: s1
  }
  struct s7 {
    var p0: [s1]
    var p1: s5
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v2: [s1] = v0.p0
    let v6: s1 = v2[0]
    let v8: [[s0]] = v6.p0
    let v11: [s0] = v8[0]
    let v12: s0 = v11[0]
    let v14: [[Double]] = v12.p0
    let v59: [Double] = v14[0]
    var v53: [Double] = v59
    let v62: Double = v53[0]
    let v67: Double = v1 - v62
    let v56: Double = v67 + v67
    return v56
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))], p1: s5(p0: [[s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])]], p1: s1(p0: [[s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])], [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])], [s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])]], p1: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]))))
    let v1: Double = 55.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 55.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
