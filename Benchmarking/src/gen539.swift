  import Dispatch
  @inline(never)
  func f0(_ v0: Double) -> Double {
    var v1: Double = v0
    var v5: Double = v1
    let v3: [Double] = [v1, v5, v1, v0, v5, v1, v0]
    v1 = v5
    let v6: Double = v3[3]
    let v2: Double = v3[1]
    let v10: Double = v3[3]
    var v8: Double = v10
    var v7: [Double] = v3
    var v18: Double = v8
    var v23: Double = v18
    v7[1] = v1
    v7[3] = v23
    v7[0] = v2
    v7[5] = v6
    let v38: Double = v7[0]
    var v36: [Double] = v3
    v36[0] = v38
    let v79: Double = v36[2]
    return v79
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
