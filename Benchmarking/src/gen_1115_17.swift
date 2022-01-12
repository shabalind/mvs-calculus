  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: [s1], _ v2: Double) -> Double {
    var v8: Double = v2
    let v6: [Double] = [v8, v2, v2, v2, v8, v2]
    let v15: s1 = v1[0]
    let v13: s0 = v15.p0
    let v21: [[Double]] = v13.p0
    let v30: [Double] = v21[1]
    let v32: Double = v30[0]
    var v63: [Double] = v6
    v63[1] = v32
    let v103: Double = v63[2]
    return v103
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]))], [s1(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))], [s1(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]))]]
    let v1: [s1] = [s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]))]
    let v2: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
