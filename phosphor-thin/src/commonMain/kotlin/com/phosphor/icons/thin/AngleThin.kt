package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.AngleThin: ImageVector
    get() {
        if (_AngleThin != null) {
            return _AngleThin!!
        }
        _AngleThin = ImageVector.Builder(
            name = "Thin.AngleThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 72f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 32f)
                lineToRelative(0f, 168f)
                lineToRelative(168f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 72f)
                lineTo(72f, 72f)
            }
        }.build()

        return _AngleThin!!
    }

@Suppress("ObjectPropertyName")
private var _AngleThin: ImageVector? = null
