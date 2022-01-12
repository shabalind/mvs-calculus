  import Dispatch
  func f6(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v2: [Double] = v1[0]
    var v3: [[Double]] = v1
    var v5: [[Double]] = v3
    var v7: [[Double]] = v5
    v3[1] = v2
    let v8: [Double] = v0[1]
    var v14: [Double] = v8
    let v10: Double = v2[0]
    v3 = v5
    v14[0] = v10
    v3[1] = v14
    return v7
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    let v11: [[Double]] = f6(v1, v1)
    let v10: [Double] = v0[2]
    let v12: [[Double]] = f6(v1, v1)
    var v16: [[Double]] = v1
    let v14: [[Double]] = f6(v11, v16)
    let v18: [[Double]] = f6(v12, v1)
    v16[1] = v10
    let v27: [Double] = v14[1]
    let v43: [Double] = v11[0]
    let v79: [Double] = v18[0]
    let v53: [Double] = v11[0]
    var v96: [Double] = v53
    var v102: [Double] = v79
    let v146: [[Double]] = [v79, v27, v96, v43, v102]
    v16[0] = v96
    let v127: [Double] = v146[0]
    v16[0] = v127
    let v142: Double = v127[0]
    return v142
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [[Double]] = [[3.0], [4.0]]
    let v2: [[Double]] = [[5.0], [6.0], [7.0]]
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
