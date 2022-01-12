  import Dispatch
  func f81(_ v0: Double) -> Double {
    var v3: Double = v0
    var v1: Double = v3
    var v5: Double = v3
    let v2: Double = v1 + v3
    var v8: Double = v0
    var v7: Double = v8
    var v6: Double = v5
    var v12: Double = v6
    var v11: Double = v12
    let v18: [Double] = [v7, v0, v11, v5, v3, v7]
    let v20: Double = v18[2]
    var v39: [Double] = v18
    v39[5] = v20
    v39[0] = v11
    v39[3] = v2
    let v40: Double = v39[5]
    return v40
  }
  func f44(_ v0: [Double], _ v1: [Double]) -> [Double] {
    let v3: Double = v0[0]
    let v9: Double = f81(v3)
    var v13: Double = v9
    var v14: [Double] = v0
    let v28: Double = v14[0]
    var v10: [Double] = v0
    v10[0] = v28
    v10[0] = v13
    let v32: Double = v14[0]
    var v26: [Double] = v10
    var v56: [Double] = v26
    let v132: Double = v14[0]
    var v68: [Double] = v56
    v10[0] = v32
    var v145: [Double] = v68
    v26[0] = v132
    var v157: [Double] = v10
    v10 = v157
    return v145
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    var v6: Double = v3
    let v4: [Double] = v1[0]
    var v13: [Double] = v4
    let v10: [Double] = f44(v4, v4)
    let v9: Double = v13[0]
    v13[0] = v9
    let v21: Double = v6 * v9
    v13[0] = v6
    let v34: Double = v10[0]
    let v36: Double = v21 + v34
    return v36
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0], [2.0], [3.0]]
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
