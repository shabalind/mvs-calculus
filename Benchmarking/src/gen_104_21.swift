  import Dispatch
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    var v6: Double = v1
    var v2: Double = v6
    var v4: Double = v2
    var v3: [Double] = v0
    v3[1] = v4
    var v13: Double = v2
    v3[1] = v13
    v2 = v13
    let v10: Double = v3[1]
    var v9: Double = v1
    var v19: [Double] = v0
    v3 = v0
    v3[1] = v1
    v9 = v10
    let v63: Double = v2 - v9
    v3[0] = v13
    v3 = v19
    v19[1] = v13
    return v63
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
