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
  }
  struct s3 {
    var p0: s2
    var p1: s2
    var p2: s0
  }
  struct s8 {
    var p0: s3
    var p1: [s1]
  }
  func f14(_ v0: s8) -> s8 {
    var v1: s8 = v0
    var v3: s8 = v0
    let v7: [s1] = v3.p1
    v1.p1 = v7
    let v15: [s1] = v0.p1
    v1.p1 = v15
    let v118: s3 = v1.p0
    v3.p0 = v118
    v3 = v0
    return v1
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    let v4: s8 = f14(v0)
    let v7: [s1] = v4.p1
    let v12: s1 = v7[0]
    let v18: s0 = v12.p1
    let v10: [[Double]] = v18.p1
    let v16: [Double] = v10[0]
    let v27: Double = v16[0]
    let v19: Double = v16[0]
    let v31: Double = v16[0]
    let v39: Double = v27 + v19
    let v49: Double = v39 * v31
    return v49
  }
  func benchmark() {
    let v0: s8 = s8(p0: s3(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))), p1: s2(p0: s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))), p2: s0(p0: [[12.0], [13.0]], p1: [[14.0]])), p1: [s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]]), p1: s0(p0: [[18.0], [19.0]], p1: [[20.0]]))])
    let v1: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
