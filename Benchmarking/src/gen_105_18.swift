  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f2(_ v0: Double) -> Double {
    var v6: Double = v0
    var v1: Double = v6
    var v7: Double = v1
    var v10: Double = v0
    v7 = v10
    var v21: Double = v10
    var v8: Double = v7
    var v15: Double = v7
    var v35: Double = v21
    var v26: Double = v8
    var v34: Double = v35
    var v16: Double = v34
    var v29: Double = v26
    let v37: [Double] = [v16, v15, v29, v26]
    let v47: Double = v37[1]
    return v47
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v3: Double = f2(v1)
    var v2: Double = v1
    let v8: [Double] = [v1, v3, v2]
    var v7: [Double] = v8
    let v10: Double = v7[2]
    let v26: Double = f2(v1)
    let v46: Double = v8[1]
    let v104: Double = v3 * v26
    let v58: Double = v104 / v10
    v7[1] = v46
    v7[0] = v1
    v7 = v8
    return v58
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
