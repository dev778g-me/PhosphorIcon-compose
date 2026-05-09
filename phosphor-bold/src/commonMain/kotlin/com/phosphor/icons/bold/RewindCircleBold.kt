package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.RewindCircleBold: ImageVector
    get() {
        if (_RewindCircleBold != null) {
            return _RewindCircleBold!!
        }
        _RewindCircleBold = ImageVector.Builder(
            name = "Bold.RewindCircleBold",
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
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(117.2f, 85.18f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.7f, 1.45f)
                lineToRelative(-40f, 32f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18.74f)
                lineToRelative(40f, 32f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124f, 160f)
                verticalLineTo(96f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 117.2f, 85.18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(173.2f, 85.18f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.7f, 1.45f)
                lineToRelative(-40f, 32f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18.74f)
                lineToRelative(40f, 32f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 180f, 160f)
                verticalLineTo(96f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 173.2f, 85.18f)
                close()
            }
        }.build()

        return _RewindCircleBold!!
    }

@Suppress("ObjectPropertyName")
private var _RewindCircleBold: ImageVector? = null
