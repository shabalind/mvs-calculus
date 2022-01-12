  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  func f8(_ v0: Double) -> Double {
    var v6: Double = v0
    v6 = v0
    v6 = v0
    var v9: Double = v0
    var v2: Double = v9
    var v7: Double = v6
    var v5: Double = v7
    let v3: [Double] = [v6, v5, v5, v5, v0, v5, v6]
    var v21: [Double] = v3
    v21[5] = v0
    let v12: Double = v21[4]
    v21[1] = v0
    v21[2] = v6
    var v14: [Double] = v21
    var v13: Double = v2
    var v20: [Double] = v21
    v20[0] = v6
    var v35: Double = v0
    let v18: Double = v14[2]
    var v22: [Double] = v3
    var v19: Double = v13
    v14 = v3
    var v36: Double = v35
    v20[1] = v9
    let v25: Double = v20[4]
    v14[4] = v12
    var v76: [Double] = v21
    v22[4] = v25
    var v43: Double = v18
    v22[6] = v7
    var v15: Double = v13
    let v26: Double = v76[5]
    var v23: Double = v12
    let v27: Double = v22[5]
    v22[2] = v15
    let v40: [Double] = [v5, v25, v27, v26]
    v76 = v22
    var v31: Double = v35
    var v38: [Double] = v40
    let v29: Double = v21[2]
    let v48: [Double] = [v43, v36, v36, v25, v29]
    v22[6] = v27
    let v55: Double = v48[2]
    let v32: Double = v3[3]
    let v39: Double = v3[0]
    let v171: Double = v21[4]
    var v69: Double = v55
    var v56: [Double] = v48
    v38[3] = v15
    v14[0] = v23
    let v79: Double = v56[4]
    v76[3] = v19
    let v58: Double = v48[2]
    v19 = v32
    v69 = v171
    let v118: Double = v38[3]
    v38[3] = v0
    v38[2] = v31
    let v143: Double = v38[2]
    v20[6] = v58
    v69 = v143
    v38[2] = v39
    v22[1] = v79
    v20[2] = v118
    return v69
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v8: Double = f8(v1)
    var v19: Double = v8
    return v19
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: 0.0, p1: [[1.0], [2.0]]), p1: [[s0(p0: 3.0, p1: [[4.0], [5.0]])], [s0(p0: 6.0, p1: [[7.0], [8.0]])], [s0(p0: 9.0, p1: [[10.0], [11.0]])]])]]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
