  import Dispatch
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    let v3: Double = v1 * v1
    var v7: [Double] = v0
    let v6: Double = v7[0]
    v7[1] = v3
    let v10: Double = v7[1]
    let v16: Double = v0[0]
    v7[0] = v16
    let v18: Double = v0[0]
    let v14: Double = v0[0]
    var v29: [Double] = v0
    v29[0] = v6
    let v30: Double = v29[1]
    v7[1] = v14
    v29[0] = v10
    let v22: Double = v7[1]
    var v165: [Double] = v29
    let v56: [[Double]] = [v165, v165]
    var v87: Double = v18
    v7[1] = v87
    v165[0] = v87
    let v82: [Double] = v56[1]
    let v95: Double = v82[0]
    v7[1] = v22
    v165[1] = v30
    return v95
  }
  func benchmark() {
    let v0: [Double] = [0.0, 1.0]
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
