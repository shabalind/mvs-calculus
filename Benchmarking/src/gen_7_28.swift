  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v3: s3 = v0[1]
    let v10: [s2] = v3.p0
    let v30: s2 = v10[0]
    let v59: s0 = v30.p1
    let v48: [[Double]] = v59.p1
    let v80: [Double] = v48[0]
    let v115: [Double] = v48[0]
    var v83: [Double] = v80
    v83 = v115
    let v127: Double = v83[0]
    return v127
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))]), s3(p0: [s2(p0: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])], p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]))])]
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
