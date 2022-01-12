  import Dispatch
  func f1(_ v0: Double) -> Double {
    var v5: Double = v0
    var v3: Double = v5
    var v6: Double = v3
    let v9: Double = v6 * v0
    var v1: Double = v3
    var v16: Double = v6
    let v2: Double = v5 + v6
    var v8: Double = v9
    let v21: [Double] = [v9, v1, v2]
    let v11: Double = v21[2]
    var v17: [Double] = v21
    var v12: Double = v11
    let v15: Double = v21[1]
    var v22: Double = v6
    v8 = v9
    v17[0] = v22
    let v43: Double = v21[0]
    var v18: [Double] = v21
    var v28: [Double] = v18
    var v37: Double = v1
    var v42: [Double] = v28
    let v32: Double = v42[1]
    let v35: Double = v18[1]
    var v56: [Double] = v17
    v28[2] = v35
    var v23: [Double] = v21
    v42[0] = v15
    v18[0] = v37
    let v38: [[Double]] = [v56, v17, v17, v42, v28, v42]
    let v34: [Double] = v38[1]
    v28[2] = v1
    var v48: Double = v8
    v42[2] = v2
    let v40: Double = v34[1]
    v28[0] = v12
    v28[0] = v16
    let v67: Double = v23[0]
    v42[0] = v32
    let v110: [Double] = [v35, v40, v15, v48, v67, v67, v48]
    v18[1] = v43
    var v83: [Double] = v110
    let v73: Double = v83[0]
    v42[2] = v40
    v56[1] = v67
    return v73
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    var v3: Double = v1
    var v2: [[Double]] = v0
    let v9: [Double] = v2[0]
    let v7: Double = v9[0]
    let v11: [Double] = v0[2]
    var v20: Double = v3
    var v6: Double = v7
    v2[0] = v11
    let v18: Double = v9[0]
    v2[1] = v9
    var v28: [Double] = v9
    let v29: Double = v28[0]
    let v16: Double = f1(v20)
    v28[0] = v3
    v2[1] = v9
    v28[0] = v6
    v28[0] = v18
    let v78: Double = v29 / v16
    return v78
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
