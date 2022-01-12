  import Dispatch
  @inline(never)
  func f0(_ v0: Double) -> Double {
    var v6: Double = v0
    var v3: Double = v0
    v6 = v3
    var v1: Double = v0
    v3 = v0
    var v7: Double = v3
    let v4: [Double] = [v1, v3, v3, v6]
    v3 = v7
    let v5: Double = v4[2]
    let v8: Double = v4[3]
    let v17: Double = v4[3]
    let v11: Double = v4[3]
    let v15: Double = v4[2]
    let v13: Double = v4[0]
    var v12: Double = v15
    let v14: Double = v4[0]
    var v38: [Double] = v4
    let v22: Double = v4[3]
    let v31: [[Double]] = [v38, v4, v38, v38, v38, v4]
    v38[0] = v14
    v38[1] = v7
    var v19: [Double] = v38
    var v34: [[Double]] = v31
    let v28: [Double] = v34[1]
    let v39: [Double] = v31[1]
    let v35: [Double] = v34[1]
    var v68: [[Double]] = v34
    let v26: [Double] = v68[0]
    let v84: Double = v19[3]
    v34[1] = v35
    let v47: Double = v28[0]
    let v30: [Double] = v31[5]
    let v33: Double = v26[0]
    let v60: Double = v35[3]
    let v101: Double = v35[2]
    v1 = v60
    var v77: Double = v17
    v38[1] = v84
    v34[4] = v30
    let v41: [Double] = [v7, v12, v1, v77, v22, v13, v11]
    let v75: Double = v26[0]
    var v71: [Double] = v41
    var v138: [Double] = v71
    v138[4] = v5
    let v108: Double = v41[6]
    var v162: Double = v33
    v34[5] = v39
    v34[0] = v28
    var v63: [Double] = v138
    let v131: Double = v63[0]
    v71[1] = v108
    v63[4] = v101
    v138 = v63
    v19[2] = v47
    v71[4] = v75
    v162 = v14
    v19[0] = v8
    v19[1] = v162
    return v131
  }
  func benchmark() {
    let v0: Double = 0.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 0.0
    for _ in 1...1000 {
      result = f0(v0)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
