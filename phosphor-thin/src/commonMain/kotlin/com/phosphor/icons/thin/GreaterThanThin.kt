package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.GreaterThanThin: ImageVector
    get() {
        if (_GreaterThanThin != null) {
            return _GreaterThanThin!!
        }
        _GreaterThanThin = ImageVector.Builder(
            name = "Thin.GreaterThanThin",
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
                moveTo(64f, 56f)
                lineToRelative(152f, 72f)
                lineToRelative(-152f, 72f)
            }
        }.build()

        return _GreaterThanThin!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanThin: ImageVector? = null
