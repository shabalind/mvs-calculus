  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  func f83(_ v0: [Double]) -> [Double] {
    var v2: [Double] = v0
    var v6: [Double] = v2
    v2 = v0
    var v1: [Double] = v0
    var v4: [Double] = v0
    var v7: [Double] = v2
    var v3: [Double] = v4
    var v8: [Double] = v3
    v8 = v1
    var v10: [Double] = v4
    let v14: Double = v4[0]
    var v5: Double = v14
    let v11: Double = v6[0]
    v8[0] = v5
    var v12: [Double] = v4
    let v13: [[Double]] = [v10, v7, v1, v6, v12, v1, v10]
    v6[0] = v11
    let v17: Double = v11 * v14
    v3[0] = v11
    let v16: [Double] = v13[0]
    var v18: Double = v5
    v8 = v7
    var v31: [[Double]] = v13
    var v19: Double = v17
    let v23: Double = v6[0]
    let v49: Double = v2[0]
    let v39: [[Double]] = [v2, v8]
    var v27: [[Double]] = v31
    let v32: [Double] = v39[1]
    var v69: Double = v23
    let v25: [Double] = v39[0]
    var v30: [[Double]] = v27
    let v55: [Double] = v39[1]
    v12[0] = v18
    var v48: [[Double]] = v30
    let v75: Double = v7[0]
    let v41: [Double] = v30[4]
    let v47: [Double] = v27[5]
    let v157: Double = v25[0]
    let v117: [[Double]] = [v16, v32, v2]
    var v43: [[Double]] = v117
    v8[0] = v69
    let v93: Double = v75 + v19
    var v62: Double = v11
    var v94: [[Double]] = v43
    v94[1] = v8
    v2[0] = v49
    v31[2] = v55
    let v72: [Double] = v94[0]
    var v81: Double = v62
    var v73: [[Double]] = v94
    v94[1] = v47
    v3[0] = v157
    let v135: Double = v41[0]
    var v108: [[Double]] = v73
    v31 = v48
    var v109: Double = v93
    v7[0] = v135
    var v123: [[Double]] = v108
    v1[0] = v109
    let v95: [Double] = v123[1]
    var v144: Double = v81
    v12[0] = v144
    v48[2] = v72
    v1[0] = v5
    v10[0] = v135
    return v95
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v2: [Double] = [v1]
    var v5: [Double] = v2
    let v15: Double = v5[0]
    v5[0] = v1
    v5[0] = v1
    let v16: [Double] = f83(v5)
    let v27: Double = v16[0]
    let v21: Double = v5[0]
    v5[0] = v27
    v5[0] = v1
    v5[0] = v15
    var v34: Double = v15
    v5[0] = v34
    var v45: Double = v15
    var v92: Double = v27
    v5[0] = v45
    let v188: [Double] = [v45, v21, v92, v34]
    var v109: [Double] = v188
    let v95: Double = v109[1]
    return v95
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: s0(p0: [[0.0]]), p1: s0(p0: [[1.0]])), p1: [s0(p0: [[2.0]]), s0(p0: [[3.0]])]), s2(p0: s1(p0: s0(p0: [[4.0]]), p1: s0(p0: [[5.0]])), p1: [s0(p0: [[6.0]]), s0(p0: [[7.0]])]), s2(p0: s1(p0: s0(p0: [[8.0]]), p1: s0(p0: [[9.0]])), p1: [s0(p0: [[10.0]]), s0(p0: [[11.0]])])]
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
