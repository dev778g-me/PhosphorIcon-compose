package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PentagonBold: ImageVector
    get() {
        if (_PentagonBold != null) {
            return _PentagonBold!!
        }
        _PentagonBold = ImageVector.Builder(
            name = "Bold.PentagonBold",
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
                moveTo(35.27f, 93.93f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, 8.9f)
                lineToRelative(32f, 107.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 216f)
                horizontalLineTo(184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.62f, -5.55f)
                lineToRelative(32f, -107.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, -8.9f)
                lineToRelative(-88f, -68.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.46f, 0f)
                close()
            }
        }.build()

        return _PentagonBold!!
    }

@Suppress("ObjectPropertyName")
private var _PentagonBold: ImageVector? = null
