  import Dispatch
  struct s2 {
    var p0: Double
  }
  func f48(_ v0: s2) -> s2 {
    var v3: s2 = v0
    var v5: s2 = v0
    var v6: s2 = v5
    var v13: s2 = v3
    let v11: Double = v6.p0
    v13.p0 = v11
    v5.p0 = v11
    var v7: s2 = v13
    var v26: s2 = v7
    return v26
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v7: s2 = f48(v0)
    let v5: Double = v0.p0
    var v12: s2 = v0
    var v6: Double = v1
    v12.p0 = v5
    var v10: Double = v6
    v12.p0 = v1
    let v27: Double = v0.p0
    v10 = v27
    v12.p0 = v10
    let v51: Double = v7.p0
    v12.p0 = v51
    let v61: s2 = f48(v12)
    v12.p0 = v51
    let v166: Double = v61.p0
    return v166
  }
  func benchmark() {
    let v0: s2 = s2(p0: 0.0)
    let v1: Double = 1.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 1.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
