package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.WrenchBold: ImageVector
    get() {
        if (_WrenchBold != null) {
            return _WrenchBold!!
        }
        _WrenchBold = ImageVector.Builder(
            name = "Bold.WrenchBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(73f, 217f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39f, 183f)
                lineToRelative(63.77f, -58.28f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 36.65f)
                lineTo(144f, 80f)
                lineToRelative(5.66f, 26.34f)
                lineTo(176f, 112f)
                lineToRelative(43.35f, -40f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -88.1f, 81.2f)
                close()
            }
        }.build()

        return _WrenchBold!!
    }

@Suppress("ObjectPropertyName")
private var _WrenchBold: ImageVector? = null
