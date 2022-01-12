  import Dispatch
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    let v4: Double = v0[2]
    let v3: [Double] = [v1, v4]
    let v2: Double = v3[0]
    let v15: Double = v3[0]
    var v11: Double = v4
    var v6: Double = v2
    let v26: Double = v0[2]
    let v23: Double = v11 - v11
    let v18: Double = v23 * v1
    var v21: Double = v6
    let v27: [Double] = [v18, v21, v1, v26, v15, v26]
    let v69: Double = v27[5]
    return v69
  }
  func benchmark() {
    let v0: [Double] = [0.0, 1.0, 2.0]
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
