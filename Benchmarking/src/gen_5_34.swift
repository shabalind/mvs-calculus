  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v5: s3 = v0[1]
    let v9: s2 = v5.p0
    let v8: [s0] = v9.p1
    let v12: s0 = v8[1]
    let v7: [[Double]] = v12.p0
    let v15: Double = v1 / v1
    let v27: [Double] = v7[1]
    let v18: Double = v27[0]
    let v35: Double = v15 / v18
    let v47: Double = v15 - v35
    return v47
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s2(p0: s0(p0: [[0.0], [1.0]]), p1: [s0(p0: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]]), s0(p0: [[6.0], [7.0]])]), p1: s1(p0: [[s0(p0: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0]])], [s0(p0: [[12.0], [13.0]])]], p1: [s0(p0: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]]), s0(p0: [[18.0], [19.0]])])), s3(p0: s2(p0: s0(p0: [[20.0], [21.0]]), p1: [s0(p0: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]]), s0(p0: [[26.0], [27.0]])]), p1: s1(p0: [[s0(p0: [[28.0], [29.0]])], [s0(p0: [[30.0], [31.0]])], [s0(p0: [[32.0], [33.0]])]], p1: [s0(p0: [[34.0], [35.0]]), s0(p0: [[36.0], [37.0]]), s0(p0: [[38.0], [39.0]])]))]
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
