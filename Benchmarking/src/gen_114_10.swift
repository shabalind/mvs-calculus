  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: [s0]
    var p1: s1
  }
  struct s6 {
    var p0: s3
    var p1: [Double]
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    let v6: s6 = v0[0]
    var v7: Double = v1
    let v4: [Double] = v6.p1
    let v8: Double = v4[0]
    var v13: [Double] = v4
    v13[0] = v7
    let v12: Double = v7 / v1
    v13 = v4
    let v38: Double = v4[1]
    v7 = v12
    v13[0] = v8
    v13[0] = v38
    let v83: Double = v13[1]
    let v97: Double = v83 / v12
    return v97
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: s3(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], p1: s1(p0: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], p1: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])])), p1: [20.0, 21.0]), s6(p0: s3(p0: [s0(p0: [[22.0]], p1: [[23.0], [24.0], [25.0]])], p1: s1(p0: [s0(p0: [[26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0], [32.0], [33.0]]), s0(p0: [[34.0]], p1: [[35.0], [36.0], [37.0]])], p1: [s0(p0: [[38.0]], p1: [[39.0], [40.0], [41.0]])])), p1: [42.0, 43.0])]
    let v1: Double = 44.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 44.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
