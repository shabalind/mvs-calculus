  import Dispatch
  func f12(_ v0: Double) -> Double {
    var v3: Double = v0
    var v5: Double = v0
    var v7: Double = v5
    var v2: Double = v3
    v5 = v7
    var v1: Double = v0
    var v9: Double = v1
    var v4: Double = v2
    v7 = v9
    var v8: Double = v9
    var v11: Double = v5
    let v12: [Double] = [v9, v8]
    var v16: [Double] = v12
    var v21: [Double] = v12
    v16[1] = v0
    v8 = v7
    let v43: Double = v21[0]
    var v35: [Double] = v16
    v16[1] = v5
    var v36: [Double] = v21
    v16[0] = v43
    v36[0] = v3
    let v37: Double = v36[0]
    v35[1] = v3
    v36[1] = v3
    v16[0] = v37
    var v42: [Double] = v16
    v21 = v42
    var v31: [Double] = v35
    var v52: [Double] = v31
    v31[0] = v4
    v52[1] = v11
    let v40: Double = v52[0]
    v16[1] = v5
    v31[0] = v0
    return v40
  }
  @inline(never)
  func f0(_ v0: Double) -> Double {
    let v6: [Double] = [v0, v0, v0, v0, v0, v0, v0]
    var v5: [Double] = v6
    var v7: Double = v0
    var v4: Double = v7
    let v2: Double = f12(v0)
    var v1: [Double] = v5
    let v3: Double = f12(v0)
    var v12: [Double] = v6
    let v10: Double = v1[6]
    var v11: Double = v4
    let v17: Double = f12(v7)
    var v13: Double = v2
    let v21: Double = v6[5]
    let v35: Double = v12[1]
    v13 = v3
    v5[6] = v3
    var v34: Double = v17
    let v22: Double = f12(v17)
    let v49: [[Double]] = [v12]
    let v30: Double = v5[4]
    let v47: Double = f12(v35)
    v12[6] = v21
    let v28: Double = f12(v30)
    let v42: [Double] = v49[0]
    let v60: Double = f12(v34)
    let v54: Double = f12(v10)
    v1[4] = v47
    let v63: Double = f12(v4)
    let v67: Double = f12(v11)
    let v186: [Double] = v49[0]
    let v101: Double = v186[3]
    let v50: Double = v42[0]
    var v135: Double = v22
    v12[0] = v28
    v5[0] = v63
    let v93: Double = f12(v13)
    let v197: Double = f12(v35)
    let v230: Double = f12(v60)
    v1[1] = v50
    let v94: Double = f12(v197)
    let v282: [Double] = [v230, v94, v54, v135, v67, v35]
    let v178: Double = v282[3]
    v1[6] = v93
    v5[0] = v101
    return v178
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
