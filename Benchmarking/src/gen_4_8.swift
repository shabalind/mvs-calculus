  import Dispatch
  @inline(never)
  func f0(_ v0: Double) -> Double {
    let v2: [Double] = [v0]
    var v1: [Double] = v2
    let v3: Double = v2[0]
    let v5: Double = v1[0]
    v1[0] = v5
    v1[0] = v3
    v1[0] = v3
    let v6: [Double] = [v5, v5, v3, v5]
    let v11: Double = v6[3]
    var v7: [Double] = v6
    var v4: [Double] = v6
    let v16: [[Double]] = [v4, v4, v4]
    v4[2] = v0
    let v8: Double = v7[0]
    v4[2] = v11
    var v21: Double = v8
    v7[0] = v3
    var v20: [[Double]] = v16
    let v12: Double = v2[0]
    let v43: Double = v7[1]
    let v39: [Double] = v20[0]
    v4[1] = v43
    let v35: [Double] = v20[0]
    let v29: Double = v35[1]
    v4[3] = v12
    v20[2] = v39
    var v150: Double = v0
    let v53: Double = v150 + v21
    let v42: [Double] = v16[1]
    v1[0] = v53
    let v96: Double = v8 * v29
    v20[1] = v42
    return v96
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
