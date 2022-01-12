  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [Double]
  }
  struct s2 {
    var p0: [[s1]]
    var p1: s0
  }
  func f96(_ v0: Double) -> Double {
    var v1: Double = v0
    var v6: Double = v0
    var v3: Double = v6
    var v4: Double = v0
    v6 = v3
    var v2: Double = v4
    var v8: Double = v0
    var v9: Double = v0
    var v12: Double = v9
    var v5: Double = v1
    var v13: Double = v5
    let v11: [Double] = [v0, v12, v3, v13, v12]
    var v7: Double = v1
    var v16: [Double] = v11
    var v24: Double = v8
    var v22: Double = v6
    let v35: Double = v11[1]
    let v28: Double = v16[0]
    v16[4] = v2
    var v14: Double = v22
    v16[1] = v28
    var v45: [Double] = v16
    var v36: [Double] = v45
    var v30: [Double] = v16
    let v50: [[Double]] = [v11, v30, v45, v11]
    v45[2] = v14
    let v51: Double = v11[1]
    var v32: [[Double]] = v50
    var v102: [[Double]] = v50
    v16[4] = v7
    let v39: [Double] = v32[2]
    var v73: [Double] = v36
    v30[1] = v51
    v16[1] = v35
    let v174: Double = v39[1]
    v73[4] = v2
    v30[2] = v14
    v32 = v102
    v73[3] = v24
    v102[1] = v73
    return v174
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v7: s0 = v0.p1
    let v4: [[Double]] = v7.p0
    let v3: Double = v1 * v1
    let v6: Double = f96(v3)
    let v8: [Double] = v4[0]
    let v9: Double = v8[0]
    let v21: Double = f96(v9)
    let v18: Double = v21 / v6
    let v27: Double = f96(v6)
    var v43: Double = v1
    var v109: Double = v43
    let v136: Double = v27 * v109
    let v214: Double = v136 * v18
    return v214
  }
  func benchmark() {
    let v0: s2 = s2(p0: [[s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], p1: [8.0])], [s1(p0: [s0(p0: [[9.0]], p1: [[10.0], [11.0], [12.0]]), s0(p0: [[13.0]], p1: [[14.0], [15.0], [16.0]])], p1: [17.0])]], p1: s0(p0: [[18.0]], p1: [[19.0], [20.0], [21.0]]))
    let v1: Double = 22.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 22.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
