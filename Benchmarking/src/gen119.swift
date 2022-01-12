  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    let v5: [Double] = [v2, v2, v2, v2, v2]
    let v28: Double = v2 + v2
    var v13: [Double] = v5
    var v16: [Double] = v13
    v13 = v16
    v13[1] = v28
    v13 = v5
    let v31: Double = v13[1]
    let v38: Double = v16[4]
    let v60: Double = v16[4]
    let v44: Double = v38 - v31
    let v96: Double = v44 / v60
    return v96
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [[Double]] = [[3.0], [4.0], [5.0]]
    let v2: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
