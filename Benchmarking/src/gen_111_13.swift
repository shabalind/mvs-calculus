  import Dispatch
  func f2(_ v0: Double) -> Double {
    var v4: Double = v0
    var v6: Double = v4
    var v3: Double = v6
    var v5: Double = v4
    var v7: Double = v3
    var v1: Double = v5
    var v12: Double = v7
    let v17: Double = v6 / v4
    var v21: Double = v1
    var v8: Double = v12
    let v18: [Double] = [v3, v12, v21]
    let v56: [[Double]] = [v18, v18, v18]
    var v24: [[Double]] = v56
    let v31: [Double] = [v3, v5, v8, v5]
    v24[0] = v18
    let v73: [Double] = v24[2]
    let v33: [Double] = v24[0]
    var v37: [[Double]] = v24
    var v50: Double = v7
    v37[0] = v18
    var v32: [[Double]] = v37
    var v59: [[Double]] = v32
    v24[2] = v33
    var v55: [Double] = v73
    v59[2] = v33
    v32[1] = v18
    v24[0] = v73
    let v36: Double = v55[0]
    var v41: [Double] = v18
    var v48: [Double] = v18
    var v83: [[Double]] = v59
    v37[2] = v33
    v48[0] = v36
    v83[1] = v48
    var v53: [Double] = v31
    v41[0] = v50
    v55[1] = v17
    let v51: Double = v53[3]
    v55[0] = v51
    let v172: [Double] = v59[0]
    v24[0] = v33
    let v64: [Double] = v83[1]
    var v86: [[Double]] = v56
    v59[2] = v41
    v55 = v172
    let v85: Double = v64[2]
    let v82: [Double] = v86[2]
    v83[0] = v82
    v83[0] = v82
    return v85
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    let v5: Double = v3 * v3
    let v20: Double = f2(v5)
    let v17: Double = f2(v5)
    var v52: Double = v17
    let v28: Double = v52 * v5
    v52 = v20
    let v150: Double = f2(v28)
    return v150
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [[Double]] = [[3.0], [4.0], [5.0]]
    let v2: [[Double]] = [[6.0], [7.0]]
    let v3: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
