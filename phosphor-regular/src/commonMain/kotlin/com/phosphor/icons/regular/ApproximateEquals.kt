package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.ApproximateEquals: ImageVector
    get() {
        if (_ApproximateEquals != null) {
            return _ApproximateEquals!!
        }
        _ApproximateEquals = ImageVector.Builder(
            name = "Regular.ApproximateEquals",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 161.61f)
                curveToRelative(72f, -59.69f, 104f, 56.47f, 176f, -3.22f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 97.61f)
                curveToRelative(72f, -59.69f, 104f, 56.47f, 176f, -3.22f)
            }
        }.build()

        return _ApproximateEquals!!
    }

@Suppress("ObjectPropertyName")
private var _ApproximateEquals: ImageVector? = null
