  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v2: Double = v1
    let v3: [Double] = [v1, v1, v1, v2]
    let v6: Double = v3[2]
    let v7: Double = v3[3]
    let v9: Double = v3[3]
    var v4: Double = v2
    var v13: [Double] = v3
    v13[2] = v9
    var v11: Double = v9
    let v15: Double = v13[3]
    v2 = v15
    let v34: Double = v3[0]
    var v16: Double = v6
    let v26: Double = v4 + v7
    v13[1] = v34
    let v50: [Double] = [v11, v26, v16, v2, v6, v34]
    v13[2] = v15
    let v57: Double = v50[0]
    return v57
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [0.0, 1.0], p1: [[2.0], [3.0]]), p1: s0(p0: [4.0, 5.0], p1: [[6.0], [7.0]]))
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
