  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: s0, _ v3: Double) -> Double {
    let v7: [[Double]] = v2.p0
    let v5: [[Double]] = v2.p1
    var v4: Double = v3
    var v11: [[Double]] = v7
    let v8: Double = v3 + v4
    var v26: [[Double]] = v5
    let v51: [Double] = v26[0]
    let v14: [Double] = v26[0]
    let v17: Double = v51[0]
    let v45: [[Double]] = v0.p1
    let v42: [Double] = v11[1]
    let v49: Double = v51[0]
    v26[1] = v14
    let v93: [Double] = [v8, v49, v17, v49]
    v26[2] = v14
    v26[1] = v42
    v26 = v45
    let v128: Double = v93[1]
    return v128
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])
    let v1: s0 = s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])
    let v2: s0 = s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])
    let v3: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
