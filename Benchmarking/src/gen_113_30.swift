  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f98(_ v0: Double) -> Double {
    var v2: Double = v0
    var v1: Double = v2
    var v10: Double = v1
    var v5: Double = v1
    v5 = v10
    return v5
  }
  func f40(_ v0: Double) -> Double {
    let v6: Double = f98(v0)
    var v3: Double = v0
    let v1: Double = f98(v3)
    v3 = v6
    var v4: Double = v0
    v3 = v1
    let v26: Double = f98(v1)
    let v28: Double = f98(v4)
    let v23: Double = f98(v28)
    let v71: Double = v23 * v26
    return v71
  }
  func f30(_ v0: Double) -> Double {
    var v2: Double = v0
    let v9: Double = f40(v2)
    var v4: Double = v0
    var v3: Double = v4
    var v18: Double = v4
    let v7: [Double] = [v9]
    let v10: Double = f98(v3)
    var v19: [Double] = v7
    var v30: [Double] = v7
    var v29: [Double] = v30
    v30[0] = v3
    let v21: Double = f98(v2)
    let v24: Double = f98(v3)
    var v16: [Double] = v19
    let v12: Double = v16[0]
    v30[0] = v21
    let v34: Double = f40(v10)
    v16[0] = v24
    var v31: Double = v18
    var v51: [Double] = v16
    let v58: [[Double]] = [v7, v16, v29]
    let v65: [Double] = v58[0]
    v30[0] = v24
    let v25: Double = v65[0]
    v51[0] = v34
    var v47: [Double] = v29
    let v40: Double = f40(v31)
    let v38: Double = v51[0]
    v30 = v47
    v47[0] = v38
    let v48: Double = v51[0]
    let v73: Double = f40(v9)
    v47[0] = v73
    v30[0] = v40
    v51[0] = v48
    v19[0] = v12
    return v25
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v5: Double = v1 - v1
    let v11: Double = f30(v5)
    let v34: Double = v5 + v11
    return v34
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])])]]
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
