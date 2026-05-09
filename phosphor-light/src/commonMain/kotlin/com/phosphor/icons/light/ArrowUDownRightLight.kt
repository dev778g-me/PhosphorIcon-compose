package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ArrowUDownRightLight: ImageVector
    get() {
        if (_ArrowUDownRightLight != null) {
            return _ArrowUDownRightLight!!
        }
        _ArrowUDownRightLight = ImageVector.Builder(
            name = "Light.ArrowUDownRightLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 120f)
                lineToRelative(48f, 48f)
                lineToRelative(-48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 56f)
                horizontalLineTo(88f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
                horizontalLineToRelative(0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
                horizontalLineTo(224f)
            }
        }.build()

        return _ArrowUDownRightLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUDownRightLight: ImageVector? = null
