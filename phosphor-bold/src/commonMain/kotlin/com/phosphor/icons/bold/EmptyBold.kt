package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.EmptyBold: ImageVector
    get() {
        if (_EmptyBold != null) {
            return _EmptyBold!!
        }
        _EmptyBold = ImageVector.Builder(
            name = "Bold.EmptyBold",
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
                moveToRelative(-88f, 0f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 176f, 0f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -176f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 40f)
                lineTo(48f, 216f)
            }
        }.build()

        return _EmptyBold!!
    }

@Suppress("ObjectPropertyName")
private var _EmptyBold: ImageVector? = null
