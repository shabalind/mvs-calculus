  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f12(_ v0: Double) -> Double {
    let v2: Double = v0 + v0
    var v7: Double = v2
    let v4: [Double] = [v7, v0, v7]
    let v6: Double = v4[1]
    v7 = v0
    var v3: Double = v2
    let v5: Double = v4[2]
    var v8: Double = v5
    let v13: Double = v4[1]
    var v1: [Double] = v4
    var v10: [Double] = v4
    v1[0] = v7
    v10[1] = v3
    let v25: Double = v1[0]
    let v23: [Double] = [v6, v6, v7, v6, v13, v13, v6]
    var v18: [Double] = v23
    let v9: Double = v23[1]
    let v19: Double = v6 / v25
    v1[2] = v6
    v1[1] = v8
    let v21: Double = v2 + v7
    var v37: [Double] = v10
    let v73: Double = v10[0]
    v18[6] = v19
    var v38: [Double] = v23
    var v20: [Double] = v18
    let v35: Double = v4[0]
    var v63: [Double] = v20
    let v48: Double = v37[1]
    v18[2] = v21
    var v52: Double = v6
    let v56: Double = v38[1]
    v18[1] = v35
    v38[6] = v48
    v1[2] = v52
    v20[4] = v56
    v3 = v73
    var v77: [Double] = v38
    let v148: Double = v63[4]
    v63[2] = v8
    v18 = v77
    v20[5] = v9
    return v148
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v21: Double = f12(v1)
    let v17: Double = f12(v21)
    return v17
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])]
    let v1: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
