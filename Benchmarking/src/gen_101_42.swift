  import Dispatch
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    var v3: Double = v1
    var v7: Double = v3
    var v2: Double = v1
    var v4: [Double] = v0
    var v9: [Double] = v0
    v9[0] = v2
    let v6: Double = v9[0]
    v4[0] = v6
    var v5: Double = v7
    v9[0] = v3
    var v11: [Double] = v9
    var v8: Double = v5
    var v14: [Double] = v0
    v4[0] = v1
    var v20: [Double] = v4
    let v10: Double = v20[0]
    v14 = v9
    v7 = v5
    let v13: Double = v4[0]
    let v34: Double = v0[0]
    var v15: Double = v3
    let v17: Double = v11[0]
    v9[0] = v2
    var v18: [Double] = v4
    let v12: Double = v14[0]
    v14[0] = v1
    let v31: Double = v13 + v17
    let v23: Double = v0[0]
    v11[0] = v8
    var v24: Double = v31
    v11[0] = v3
    v18[0] = v34
    v14[0] = v23
    let v32: Double = v18[0]
    v18[0] = v8
    v4[0] = v15
    v9[0] = v34
    var v124: Double = v8
    v14[0] = v24
    let v58: [Double] = [v31, v124, v10]
    v124 = v12
    let v56: Double = v11[0]
    var v44: [Double] = v58
    v8 = v32
    v44[0] = v5
    var v59: [Double] = v44
    v15 = v56
    let v106: Double = v59[2]
    return v106
  }
  func benchmark() {
    let v0: [Double] = [0.0]
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
