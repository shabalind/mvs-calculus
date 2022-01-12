  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    let v5: [Double] = v2[0]
    let v7: [Double] = v2[1]
    let v10: Double = v7[0]
    let v9: Double = v5[0]
    var v19: Double = v10
    v19 = v10
    let v70: [Double] = [v3, v3, v19, v9]
    let v16: [[Double]] = [v70, v70, v70]
    let v44: [Double] = v2[1]
    let v37: [Double] = v16[2]
    let v152: Double = v37[2]
    let v108: Double = v44[0]
    let v124: Double = v108 * v152
    var v137: Double = v124
    return v137
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [[Double]] = [[2.0], [3.0]]
    let v2: [[Double]] = [[4.0], [5.0]]
    let v3: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
