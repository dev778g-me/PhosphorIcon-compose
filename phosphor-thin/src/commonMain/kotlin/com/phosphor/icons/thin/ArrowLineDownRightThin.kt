package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ArrowLineDownRightThin: ImageVector
    get() {
        if (_ArrowLineDownRightThin != null) {
            return _ArrowLineDownRightThin!!
        }
        _ArrowLineDownRightThin = ImageVector.Builder(
            name = "Thin.ArrowLineDownRightThin",
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
                moveTo(40f, 40f)
                lineTo(216f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 88f)
                lineTo(192f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 104f)
                lineToRelative(0f, 96f)
                lineToRelative(-96f, 0f)
            }
        }.build()

        return _ArrowLineDownRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLineDownRightThin: ImageVector? = null
