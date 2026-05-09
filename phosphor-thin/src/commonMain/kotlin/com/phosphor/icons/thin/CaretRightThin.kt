package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.CaretRightThin: ImageVector
    get() {
        if (_CaretRightThin != null) {
            return _CaretRightThin!!
        }
        _CaretRightThin = ImageVector.Builder(
            name = "Thin.CaretRightThin",
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
                moveTo(96f, 48f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
            }
        }.build()

        return _CaretRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _CaretRightThin: ImageVector? = null
