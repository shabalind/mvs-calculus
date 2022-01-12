  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  func f70(_ v0: s0) -> s0 {
    return v0
  }
  func f68(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v5: [[Double]] = v1.p0
    let v2: [s0] = [v0]
    let v9: s0 = f70(v1)
    var v3: [s0] = v2
    let v12: [[Double]] = v1.p0
    v1.p0 = v5
    let v18: [[[Double]]] = [v12, v5, v5, v5, v5, v5]
    let v10: s0 = f70(v9)
    v3[0] = v9
    let v8: s0 = f70(v10)
    let v17: [[Double]] = v18[1]
    let v13: [[Double]] = v10.p0
    let v22: s0 = f70(v10)
    v1.p0 = v12
    let v36: s0 = f70(v22)
    v1.p0 = v17
    v1.p0 = v13
    let v39: s0 = f70(v8)
    v3[0] = v39
    var v31: [s0] = v3
    var v32: [[[Double]]] = v18
    let v42: [[Double]] = v36.p1
    let v34: [[Double]] = v32[0]
    let v113: s0 = s0(p0: v34, p1: v42)
    let v41: s0 = v31[0]
    let v100: [[Double]] = v41.p0
    v32[0] = v100
    return v113
  }
  func f13(_ v0: [s1]) -> [s1] {
    return v0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v7: [s1] = f13(v0)
    let v5: s1 = v7[0]
    let v11: s1 = v7[0]
    let v14: s1 = v7[0]
    var v4: s1 = v5
    let v18: s0 = v14.p0
    let v34: s0 = v11.p0
    let v16: s0 = f68(v34)
    let v17: s0 = v4.p0
    let v35: s1 = v0[0]
    v4.p0 = v18
    let v69: s0 = f70(v16)
    v4.p0 = v69
    v4.p0 = v17
    let v39: [[Double]] = v17.p1
    v4.p0 = v17
    let v24: [Double] = v39[2]
    let v54: s0 = v35.p0
    let v38: [[Double]] = v54.p0
    let v82: s0 = s0(p0: v38, p1: v39)
    var v104: [Double] = v24
    v4.p0 = v82
    v4.p0 = v16
    v4.p0 = v69
    let v144: Double = v104[0]
    return v144
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]))]
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
