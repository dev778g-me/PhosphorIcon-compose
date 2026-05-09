package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.RadicalThin: ImageVector
    get() {
        if (_RadicalThin != null) {
            return _RadicalThin!!
        }
        _RadicalThin = ImageVector.Builder(
            name = "Thin.RadicalThin",
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
                moveTo(240f, 104f)
                lineToRelative(0f, -24f)
                lineToRelative(-112f, 0f)
                lineToRelative(-48f, 128f)
                lineToRelative(-48f, -128f)
            }
        }.build()

        return _RadicalThin!!
    }

@Suppress("ObjectPropertyName")
private var _RadicalThin: ImageVector? = null
