package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.CoatHanger: ImageVector
    get() {
        if (_CoatHanger != null) {
            return _CoatHanger!!
        }
        _CoatHanger = ImageVector.Builder(
            name = "Regular.CoatHanger",
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
                moveTo(96f, 72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                lineTo(19.22f, 177.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 192f)
                horizontalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -14.4f)
                lineTo(128f, 96f)
            }
        }.build()

        return _CoatHanger!!
    }

@Suppress("ObjectPropertyName")
private var _CoatHanger: ImageVector? = null
