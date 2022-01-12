  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [[Double]]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v5: [[Double]] = v0.p0
    var v4: Double = v1
    var v14: [[Double]] = v5
    let v3: [Double] = v5[0]
    v14[0] = v3
    v14[0] = v3
    var v10: [[Double]] = v5
    let v19: [Double] = v14[0]
    let v13: [[Double]] = v0.p0
    let v18: Double = v1 - v1
    let v20: Double = v19[0]
    let v17: [Double] = v10[0]
    v10[0] = v17
    let v44: [Double] = v10[0]
    v10[0] = v3
    v10[0] = v17
    let v25: [Double] = v13[0]
    v14[0] = v25
    var v26: [Double] = v44
    let v32: Double = v44[0]
    v14[0] = v25
    v26[0] = v4
    let v40: Double = v17[0]
    v14[0] = v17
    var v34: Double = v32
    v26[0] = v34
    v14[0] = v26
    let v149: Double = v3[0]
    let v52: Double = v19[0]
    let v228: [Double] = [v40, v18, v149, v34, v52]
    v26[0] = v20
    let v188: Double = v228[4]
    return v188
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[0.0]], p1: [s0(p0: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0], [5.0], [6.0]]), s0(p0: [[7.0], [8.0], [9.0]])])
    let v1: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
