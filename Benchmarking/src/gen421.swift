  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v3: [Double] = v0[1]
    let v5: Double = v3[0]
    let v7: Double = v3[0]
    let v10: Double = v3[0]
    let v21: [Double] = [v7, v7, v7, v7, v5, v10]
    var v35: [Double] = v21
    let v20: Double = v21[0]
    v35[5] = v20
    var v32: [Double] = v21
    v32[1] = v7
    var v31: [Double] = v32
    var v180: [Double] = v31
    v180 = v35
    let v98: Double = v180[0]
    return v98
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
