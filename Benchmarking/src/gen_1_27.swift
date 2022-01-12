  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f37(_ v0: Double) -> Double {
    var v2: Double = v0
    var v7: Double = v0
    var v6: Double = v2
    var v1: Double = v0
    var v3: Double = v2
    v6 = v1
    var v9: Double = v2
    var v20: Double = v3
    let v15: [Double] = [v7, v20, v3, v9, v3]
    var v11: [Double] = v15
    v11[1] = v6
    let v23: Double = v15[0]
    var v27: [Double] = v11
    let v17: Double = v27[3]
    v11[1] = v17
    v27[1] = v23
    var v30: [Double] = v27
    var v37: [Double] = v30
    let v33: Double = v37[2]
    var v34: Double = v33
    return v34
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [[s0]], _ v2: Double) -> Double {
    var v3: Double = v2
    let v8: Double = f37(v2)
    var v5: Double = v8
    let v11: Double = f37(v5)
    let v23: Double = v11 + v3
    let v50: Double = f37(v23)
    return v50
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: [s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]])])
    let v1: [[s0]] = [[s0(p0: [[15.0]], p1: [[16.0], [17.0]])], [s0(p0: [[18.0]], p1: [[19.0], [20.0]])]]
    let v2: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
