  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: s0, _ v3: s0, _ v4: Double) -> Double {
    let v28: [Double] = [v4, v4, v4]
    let v14: Double = v4 + v4
    let v31: Double = v28[1]
    var v40: [Double] = v28
    let v35: [Double] = [v4, v4, v4, v4, v14]
    let v46: Double = v40[0]
    v40[0] = v31
    var v74: [Double] = v40
    v74[1] = v46
    var v45: [Double] = v74
    v45[0] = v46
    let v115: Double = v35[1]
    v74[1] = v115
    var v152: [Double] = v45
    let v406: Double = v152[0]
    return v406
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]
    let v1: s0 = s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])
    let v2: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])
    let v3: s0 = s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])
    let v4: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
