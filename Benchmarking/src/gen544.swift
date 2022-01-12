  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: [[Double]], _ v5: [Double], _ v6: Double, _ v7: [[Double]]) -> Double {
    let v11: [Double] = v1[1]
    let v20: [Double] = v2[0]
    var v12: Double = v6
    let v15: Double = v11[0]
    let v9: Double = v20[0]
    let v13: Double = v20[0]
    let v59: [Double] = [v13, v15, v9, v6, v12]
    let v77: Double = v11[0]
    v12 = v77
    let v132: [[Double]] = [v59, v59]
    let v105: [Double] = v132[0]
    let v154: Double = v105[3]
    return v154
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0], [2.0], [3.0]]
    let v2: [[Double]] = [[4.0]]
    let v3: [[Double]] = [[5.0], [6.0], [7.0]]
    let v4: [[Double]] = [[8.0], [9.0], [10.0]]
    let v5: [Double] = [11.0]
    let v6: Double = 12.0
    let v7: [[Double]] = [[13.0]]
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = [[13.0]]
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
